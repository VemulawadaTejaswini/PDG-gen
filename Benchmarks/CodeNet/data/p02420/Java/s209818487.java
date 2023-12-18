import java.util.Scanner;
public class Main{
    public static void main(String[] aa){
        Scanner s = new Scanner(System.in);
        String st;
        
        int i,now=0,m;
        while(true){
        st = s.next();
        if(st.charAt(0)=='-')break;
        m =s.nextInt();
           for(i=0;i<m;i++){
            now+=s.nextInt();
           }
           for(i=0;i<st.length();i++){
               System.out.print(st.charAt((now+i)%st.length()));
           }
           System.out.println();
           now=0;
       }
    }   
}
