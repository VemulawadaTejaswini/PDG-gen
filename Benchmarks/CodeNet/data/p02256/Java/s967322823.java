import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main{
    //読み込みのテンプレ(stringオブジェクトまで)
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        StringTokenizer token = new StringTokenizer(string," ");
        
        int x = Integer.parseInt((String)token.nextElement());
        int y = Integer.parseInt((String)token.nextElement());
        
        int answer = gcd(x,y);
        System.out.println(answer);
    }
    
    public static int gcd(int x,int y){
        
        int answer;
        
        if(x > y){
            
            while(x%y != 0 || y !=1){
                int x_1 = x;
                int y_1 = y;
                x = y;
                y = x_1 % y;
                
                if(y == 0){
                    y = y_1;
                    break;
                }
            }
            if(y == 1){
                answer = 1;
            }else{
                answer = y;
            }
            
            
        }else{
            int x_y = x;
            int y_x = y;
            
            x = y_x;
            y = x_y;
            
            while(x%y !=0 || y !=1){
                int x_1 = x;
                int y_1 = y;
                x = y;
                y = x_1 % y;
                if(y == 0){
                    y = y_1;
                    break;
                }
            }
            if(y == 1){
                answer = 1;
            }else{
                answer = y;
            }
        
        }
        return answer;
    }
}