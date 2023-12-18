import java.util.scanner;
public class Main{
    public static void main(String[] args){
        int buffernum = GetInt();
        if(buffernum > 100){
            System.out.println(buffernum*buffernum*buffernum);
        }    
    }
    int GetInt(){
        Scanner sc = new Scanner(System.in);
        int getnum = sc.nextInt();
        return getnum;
    }
}