import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String in = sc.next();
        int n=in.length();
        char[] inArray = in.toCharArray();
        int pt=-1;
        char[] display = new char[n];

        for(int i=0;i<n;i++)display[i]='\0';

        for(int i=0;i<n;i++){
            if(inArray[i]=='B'){
                if(pt!=-1){
                    display[pt]='\0';
                    pt--;
                }
            }else{
                pt++;
                display[pt]=inArray[i];
            }
        }

        for(int i=0;i<n;i++){
            if(display[i]!='\0')System.out.print(display[i]);
        }




    }
}
