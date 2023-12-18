import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Twinkle little = new Twinkle();
        little.star(1, in, out);
        out.close();


    }
static class Twinkle {
        static  int c=1;
        static  HashMap<String,Integer> map = new HashMap<>();
        public void star(int testNumber, InputReader in, PrintWriter out) {
            while (true)
            {
                int no_of_groups = in.nextInt();
                if(no_of_groups==0)
                    return;
                Map<String, String> map = new HashMap<String, String>();
                String first = "";
                for (int i = 0; i < no_of_groups; i++) {
                    String tmp[] = in.next().replace(".", "").split(":");
                    map.put(tmp[0], tmp[1]);
                    if (i == 0)
                        first = tmp[0];
                }
                Set<String> set = new HashSet<String>();
                Set<String> tag = new HashSet<String>();
                Queue<String> queue = new LinkedList<String>();
                queue.add(first);
                while (!queue.isEmpty()) {
                    String str = queue.poll();
                    if (tag.contains(str)) {
                        continue;
                    }
                    tag.add(str);
                    String strs[] = map.get(str).split(",");
                    for (int i = 0; i < strs.length; i++) {
                        if (map.containsKey(strs[i])) {
                            if (tag.contains(strs[i]))
                                continue;
                            queue.add(strs[i]);
                        } else {
                            set.add(strs[i]);
                        }
                    }
                }
                System.out.println(set.size());


            }

}

}
  


    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
      public   String nextLine()
        {
            String str = "";
            try
            {
                str = reader.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public boolean hasNext() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    String line = reader.readLine();
                    if (line == null) {
                        return false;
                    }
                    tokenizer = new StringTokenizer(line);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return true;
        }
    }
}

