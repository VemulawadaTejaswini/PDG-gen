import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String word[]=new String[1000];
        Scanner sc =new Scanner(System.in);
        String key = sc.next();
        String end = "END_OF_TEXT";
        int i=0;
        int n;
        int m;
        int count=0;
        while(true){

            word[i]=sc.next();
            n=key.indexOf(word[i]);
            m=end.indexOf(word[i]);
            if(m>=0) {
                System.out.println(count);
                break;
            }
            else if(n>=0){
                count=count+1;
            }
            i++;
        }
    }
}
