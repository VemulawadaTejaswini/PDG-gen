import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;
        str=sc.nextLine();
        char[] mo=str.toCharArray();
        int num=str.length();
        for(int i=0;i<num;i++){
            if(mo[i]>64&&mo[i]<91){
                mo[i]+=32;
            }else if(mo[i]<123&&mo[i]>96){
                mo[i]-=32;
            }
            System.out.print(mo[i]);
        }
        System.out.print("\n");

        sc.close();
    }
}

