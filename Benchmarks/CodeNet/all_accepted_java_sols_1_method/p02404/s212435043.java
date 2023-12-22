import java.util.Scanner;

class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int h = sc.nextInt();
            int w = sc.nextInt();
            
            if(h < 3) break;
            
            for(int i = 0; i < h; i++){
                for(int j = 0; j < w; j++){
                	
                	if(i == 0 || i + 1 == h || j == 0 || j + 1 == w){
                		System.out.print("#");
                	}else{
                		System.out.print(".");
                	}
                
                    //System.out.print(i == 0 || i + 1 == h || j == 0 || j + 1 == w ? '#' : '.');
                }
                System.out.println();
            }
            
            System.out.println();
        }
    }
}