public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        while (scanner.hasNext()) {
            for (int i = 0; i < 6; i++) {
                list.add(Integer.parseInt(scanner.next()));
            }
            String result = getResultOfRenritsu(list.get(0),
                    list.get(1),
                    list.get(2),
                    list.get(3),
                    list.get(4),
                    list.get(5));
            System.out.println(result);
            list.clear();
        }
    }
    
    private static String getResultOfRenritsu(int a, int b, int c, int d, int e, int f) {
        int xLCM = getLCM(a, d);
        int aKake = xLCM / a;
        a = a * aKake;
        b = b * aKake;
        c = c * aKake;

        int dKake = xLCM / d;
        d = d * dKake;
        e = e * dKake;
        f = f * dKake;

        int g, h, x, y;

        if (a > 0 && d > 0 || a < 0 && d < 0) {
            g = b - e;
            h = c - f;
            y = h / g;
            x = (-b * y + c) / a;
        } else {
            g = b + e;
            h = c + f;
            y = h / g;
            x = (-b * y + c) / a;
        }
        return x + " " + y;
    }

    private static int getGCD(int a, int b) {
        return b == 0 ? a : getGCD(b, a % b);
    }

    private static int getLCM(int a, int b) {
        return a * b / getGCD(a, b);
    }
}