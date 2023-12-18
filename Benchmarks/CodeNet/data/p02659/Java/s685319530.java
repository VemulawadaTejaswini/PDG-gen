public class Main {

    static java.util.Scanner scan = new java.util.Scanner(System.in);

    public static int pow(int a){
        int b = 1;
        for(int i = 0; i < a;i++){
            b *= 10;
        }
        return b;
    }

    public static void main(String[] args) {

        String[] line = line().split(" ");
        String[] sliced_period = line[1].split("\\.");

        Long[] vars = new Long[]{Long.parseLong(line[0]),Long.parseLong(sliced_period[0]),Long.parseLong(sliced_period[1])};

        Long first = vars[0];
        Long second = (vars[1] * (pow(sliced_period[1].length())))+vars[2];
        Long calc = first * second;
        String parse = String.valueOf(calc).split("\\.")[0];

        if(parse.length() - sliced_period[1].length() <= 0){
            puts("0");
            return;
        }

        String floor = parse.substring(0,(parse.length())-sliced_period[1].length());
        puts(floor);

        scan.close();
    }

    public static String line(){
        return scan.nextLine();
    }

    public static int[] lineInts(){
        String l = line();
        String[] l1 = l.split(" ");
        int[] a = new int[l1.length];
        for(int i = 0; i < l1.length; i++){
            a[i] = Integer.parseInt(l1[i]);
        }
        return a;
    }

    public static int[] split_piriod_Ints(String[] a){
        String l = line();
        int[] b = new int[a.length];
        for(int i = 0; i < a.length; i++){
            b[i] = Integer.parseInt(a[i]);
        }
        return b;
    }

    public static long[] lineLongs(){
        String l = line();
        String[] l1 = l.split(" ");
        long[] a = new long[l1.length];
        for(int i = 0; i < l1.length; i++){
            a[i] = Long.parseLong(l1[i]);
        }
        return a;
    }

    public static void puts(Object a){
        System.out.println(a);
    }

    public static void puts(Object... a){
        for(int i = 0; i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
