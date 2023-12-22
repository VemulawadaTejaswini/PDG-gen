import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
         Scanner scan = new Scanner(System.in);
         
         while (true){
             int a = scan.nextInt();
             int b = scan.nextInt();
             
             if ((a == 0) && (b == 0)){
                 break;
             }
             
             int c = scan.nextInt();
             int i ,j;
             int[][] input_data = new int[c][2];
             for ( i = 0; i < c ; i ++){
                 input_data[i][0] = scan.nextInt()-1;
                 input_data[i][1] = scan.nextInt()-1;
             }
             
             int [][] route = new int[a][b] ;
             
             for (i = 0; i < a; i++ ){
                 route[i][0] = 1 ;
             }
             //System.out.println(Arrays.deepToString(route));
             
             for (i = 0; i < b; i++ ){
                 route[0][i] = 1;
             }
             //System.out.println(Arrays.deepToString(route));
             
             Boolean x_flag = false;
             int x_start=0 ;
             Boolean y_flag = false;
             int y_start=0 ;
             
             for (i = 0; i < c ;i++){
                 route[input_data[i][0]][input_data[i][1]] = -100 ;
                 //System.out.println("x:"+input_data[i][0] + "y:"+input_data[i][1]);
                 if(input_data[i][1] == 0){
                     if(( input_data[i][0] < x_start)|| (x_start == 0)){
                         x_flag = true;
                         x_start = input_data[i][0] ;
                     }
                 }
                 if(input_data[i][0] == 0){
                     if((input_data[i][1] < y_start)||(y_start == 0)){
                         y_flag = true;
                         y_start = input_data[i][1] ;
                     }
                 }
             }
             
             //System.out.println("x_s:"+x_start+"  y_s:"+y_start);
             
            if(x_flag){
                for (i = x_start; i<a; i++){
                    route[i][0] = -100 ;
                }
            }
            
            if(y_flag){
                for (i = y_start; i<b; i++){
                    route[0][i] = -100 ;
                }
            }
            
            
             //System.out.println(Arrays.deepToString(route));
             
             for(i = 0; i < a; i++ ){
                 for( j = 0; j < b; j++ ){
                    if(route[i][j] < -1 ){
                        route[i][j] = 0;
                    } 
                    else if( (i != 0) && ( j != 0)) {
                        if (route[i][j-1]  < 0){
                            route[i][j-1]  = 0;
                        }
                        if (route[i-1][j] < 0) {
                            route[i-1][j] = 0;
                        }
                        route[i][j] = route[i][j-1] + route[i-1][j];
                    }
                 }
             }
            
              //System.out.println(a);
              //System.out.println(b); 
              //System.out.println(Arrays.deepToString(input_data));
              //System.out.println(Arrays.deepToString(route));
              System.out.println(route[a-1][b-1]);
              //System.out.println("#############");
         }
    }
}

