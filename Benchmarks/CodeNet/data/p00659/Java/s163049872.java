import java.util.*;

class Chara {
    String name;
    ArrayList<Integer> appear;
    private int point;

    Chara(String name, ArrayList<Integer> appear) {
        this.name = name;
        this.appear = appear;
        this.point = 0;
    }

    void addPoint(int pt) {
        this.point += pt;
    }

    int getPoint() {
        return this.point;
    }
}

class Main {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        while(true) {
            int n = Integer.parseInt(sc.nextLine());
            if( n == 0 )    break;
            
            Chara [] charas = new Chara[n];
            for(int i = 0; i < n; i++) {
                String [] line = sc.nextLine().split(" ");
                ArrayList<Integer> appear = new ArrayList<Integer>();
                for(int j = 2; j < line.length; j++) {
                    appear.add(Integer.parseInt(line[j]));
                }
                charas[i] = new Chara(line[0], appear);
            }

            for(int t = 0; t < 30; t++) {
                int point = n + 1;
                for (Chara c : charas) {
                    if (c.appear.indexOf(t) != -1) {
                        point -= 1;
                    }
                }
                for (Chara c : charas) {
                    if (c.appear.indexOf(t) != -1) {
                        c.addPoint(point);
                    }
                }
            }

            ArrayList<Integer> points = new ArrayList<Integer>();
            for(Chara c : charas) {
                points.add(c.getPoint());
            }
            int min = Collections.min(points);

            ArrayList<String> minNames = new ArrayList<String>();
            for(Chara c : charas) {
                if (c.getPoint() == min) {
                    minNames.add(c.name);
                }
            }
            Collections.sort(minNames);

            System.out.printf("%d %s\n", min, minNames.get(0));
        }

    }
}