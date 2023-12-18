import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) throws Exception {
        
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int cnt = Integer.parseInt(br.readLine());
          String[] sarray = br.readLine().split(" ",cnt);
          
          String str;
          StringBuilder sb = new StringBuilder();
          
          //????????????
          for ( int i = 0 ; i < cnt ; i++){
            int j = i;
            while (j > 0){
                if( Integer.parseInt(sarray[j]) < Integer.parseInt(sarray[j - 1]) ){
                    str = sarray[j];
                    sarray[j] = sarray[j - 1];
                    sarray[j - 1] = str;
                }
                j--;
            }
            
            for ( int n = 0 ; n < cnt ; n++){
                if ( n > 0 ){
                    sb = sb.append(" ");
                }
                sb = sb.append(sarray[n]);
            }
            System.out.println(sb);
            sb.setLength(0);
          }
    }
};
