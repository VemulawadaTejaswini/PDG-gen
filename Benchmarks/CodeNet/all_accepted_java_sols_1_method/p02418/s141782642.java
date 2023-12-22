import java.util.Scanner;
 
class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        String p=in.nextLine();
        s=s+s;
        if(s.indexOf(p)!=-1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}