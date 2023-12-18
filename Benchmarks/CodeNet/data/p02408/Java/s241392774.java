import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int x = stdIn.nextInt();
        
        int a[][]= new int[4][13];
        

        for(int k =0;k<x;k++){
                    String mark = stdIn.next();
                    int num =stdIn.nextInt();
                	
                    if(mark.equals("S")){
                  		a[0][num-1] = 1;
                    }else if(mark.equals("H")){
                 		a[1][num-1] = 1;
                    }else if(mark.equals("C")){
                        a[2][num-1] = 1;
                        
                    }else if(mark.equals("D")) {
                        a[3][num-1] = 1;
                    }else{
                        a[4][num-1] =1;
                    }
                    
                }
 		 
                             
            for(int z =0;z<4;z++){
                for(int o =0;o<13;o++){
                    
            		if(a[z][o]==0){
                        if(z==0){
                            System.out.println("S"+" "+(o+1));
                        }
                        else if(z==1){
                            System.out.println("H"+" "+(o+1));
                        }else if(z == 2){
                            System.out.println("C"+" "+(o+1));
                        }else{
                        	System.out.println("D"+" "+(o+1));                   
                   		}
                                               
                    }
          		}
         	}
    }
}
                                               
