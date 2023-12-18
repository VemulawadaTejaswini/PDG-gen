class Main{
    public static void main(String[] args){
        int s,m,h;
        s = new java.util.Scanner(System.in).nextInt();
        h = s / 3600;
        m = (s % 3600) / 60;
        System.out.println((s / 3600) + ":" + ((s % 3600) / 60)  + ":" + s % 60);
    }
}
