import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str,x;
        int i,j,ok;
        ok = 0;
        str = scan.nextLine();
        x = scan.nextLine();
        //StringBuilder sb = new StringBuilder();
        for ( i=0; i<str.length(); i++) {
             str.charAt(i);
             for(j=0; j<x.length();j++){
                 if(str.charAt((i+j)%str.length())!=x.charAt(j)){
                     ok = 0;
                     break;
                 }
                 ok++;
             }
             if(ok == x.length()){
                 System.out.println("Yes");
                 scan.close();
                 return;
             }

        }
        

        scan.close();
        System.out.println("No");
        return;
    }

}

