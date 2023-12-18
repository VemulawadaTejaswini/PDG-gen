import java.util.Scanner;

public class Main{
    public static void main(String []args){
            Scanner sc = new Scanner(System.in);
        int n,x;
        while(true){
            int counter = 0;
            n = sc.nextInt(); x = sc.nextInt();
             if(n == 0 && x == 0){
                break;
            };
            int [] arr1 = new int[n];
            int [] arr2 = new int[n];
            int [] arr3 = new int[n];
            for(int i = 0; i < n; i++){
                arr1[i] = i+1;
                arr2[i] = i+1;
                arr3[i] = i+1;
            }
            
            for(int i = 0; i< n;i++){
                for(int j = i+1; j< n;j++){
                    for (int k = j+1; k < n; k++) {
                        if (x == arr1[i]+ arr2[j] + arr3[k] ) {
                            counter++;
                        }
                    }        
                }
            }
            System.out.println(counter);
            
            
           
        }
        
    }
}
