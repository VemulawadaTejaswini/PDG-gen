import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String words=scan.next(),operationCode,repwords;
        int result,code1,code2;
        int n=scan.nextInt();
        
        for(int i=0; i<n; i++){
            operationCode=scan.next();
            code1=scan.nextInt();
            code2=scan.nextInt();
            StringBuffer strline;
            
            switch(operationCode){
                case "print":
                    System.out.println(words.substring(code1,code2+1));
                    break;
                case "reverse":
                    strline = new StringBuffer(words.substring(code1,code2+1));
                    words=words.substring(0, code1)+strline.reverse().toString()+words.substring(code2+1);
                    break;
                case "replace":
                    repwords=scan.next();
                    words=words.substring(0, code1)+repwords+words.substring(code2+1);
                    break;
            }
        }
    }
}
