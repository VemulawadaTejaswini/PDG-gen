public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int m=s/60;
        int h=m/60;
        int ss=s%60;
        
        System.out.println(h+ ":" +m+":"+ss);
    }
}