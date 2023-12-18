class Main{
    public static void main(String[] args){
        int times = new java.util.Scanner(System.in).nextInt();

        int h = times / 3600;
        int m = (times % 3600) / 60;
        int s = (times % 3600) % 60;

        System.out.println(h + ":" + m + ":" + s);
    }
}
