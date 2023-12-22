public class Main {

    public static void main(String[] args) {
        int page = new Integer(getLine()[0]);
        int ans = page/2;
        if(page % 2 == 1){
            ans += 1;
        }
        System.out.println(ans);
    }

    public static String[] getLine(){
        java.util.Scanner scan = new java.util.Scanner(System.in);
        return scan.nextLine().split(" ");
    }
}
