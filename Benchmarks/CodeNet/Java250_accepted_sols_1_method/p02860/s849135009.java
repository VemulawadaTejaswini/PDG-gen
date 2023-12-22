
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        String str=in.next();
        if(n%2!=0)
            System.out.println("No");
        else{
            int i=0,j=n/2;
            boolean flag=false;
            for(;i<j && j<n;i++,j++){
                if(str.charAt(i)!=str.charAt(j)){
                    flag=true;
                    break;
                }
            }
            if(flag)
                System.out.println("No");
            else
                System.out.println("Yes");
        }
    }
}
