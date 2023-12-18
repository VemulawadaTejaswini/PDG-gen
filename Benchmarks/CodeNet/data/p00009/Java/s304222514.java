import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
		
        int sosu[] = new int[1100000]; 
        int num = 1; 
        sosu[0] = 2;
        sosu[1] = 3; 
        int b = 0;
		
        for(int c = 3; c <= 1100000; c += 2) {
            for (int a = 1; sosu[a] * sosu[a] <= c; a++) { 
                if ( c % sosu[a] == 0) { 
                    b = 1; 
                    break;
                }
            }
            
            if(b == 0) { 
                sosu[num++] = c; 
            }
            
            b = 0;
        }
        
        
        while(stdIn.hasNext()){
            int kazu = stdIn.nextInt();
            int count = 0;
            
            for(int i = 0; ; i++){
                if(sosu[i] == kazu){
                    count = i + 1;
                    break;
                }else if(sosu[i] > kazu){
                    count = i;
                    break;
                }
            }
            
            //if(stdIn.hasNext()){
            	System.out.println(count);
            //}else{
                //System.out.print(count);
            //}
        }
		stdIn.close();
    }
}
