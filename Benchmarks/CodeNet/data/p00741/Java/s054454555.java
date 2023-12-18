import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    private final int[][] search = new int[][]{
            {0, 1},
            {0, -1},
            {1, 1},
            {1, -1},
            {1, 0},
            {-1, 1},
            {-1, 0},
            {-1, -1}
    };

    public static void main(final String[] args) throws IOException {
        new Main().run();
    }

    private void run() throws IOException {
        boolean b = true;
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (b) {
            b = runOnce(reader);
        }

        reader.close();
    }

    private boolean runOnce(final BufferedReader reader) throws IOException {
        final String[] params = reader.readLine().split(" ");
        final int x = Integer.parseInt(params[0]);
        final int y = Integer.parseInt(params[1]);
        if (x == 0 && y == 0) return false;

        final Set<Field> fields = new HashSet<>();
        for (int i = 0; i < y; i++) {
            final String[] line = reader.readLine().split(" ");
            for (int j = 0; j < line.length; j++) {
                final boolean land = line[j].equals("1");
                if (land) {
                    fields.add(new Field(i, j));
                }
            }
        }
        int landCount = 0;
        while (true) {
            final Iterator<Field> iterator = fields.iterator();
            if (!iterator.hasNext()) {
                break;
            }
            final Field next = iterator.next();
            searchLand(next, fields);
            landCount++;
        }
        System.out.println(landCount);
        return true;
    }

    private void searchLand(final Field field, final Set<Field> fields) {
        fields.remove(field);

        final Field tmp = new Field(0, 0);
        for (final int[] s: search) {
            tmp.x = field.x + s[0];
            tmp.y = field.y + s[1];
            if(fields.contains(tmp)) {
                searchLand(tmp, fields);
                fields.remove(tmp);
            }
        }
    }

    private final class Field {
        int x, y;

        Field(final int x, final int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int hashCode() {
            return x * 2 + y * 101;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj instanceof Field) {
                return ((Field) obj).x == this.x && ((Field) obj).y == this.y;
            }
            return super.equals(obj);
        }
    }
}