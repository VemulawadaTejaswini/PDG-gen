import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        String s=scn.next();
        int k=scn.nextInt();
        //char k-1を見る
        for(int i=0;i<n;i++){
            if(s.charAt(k-1)==s.charAt(i)){ 
                System.out.print(s.charAt(k-1));
            }else{
                System.out.print("*");
            }
        }
        System.out.println();
    }
}
