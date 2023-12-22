import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       // int n = sc.nextInt();
        int a[] = new int[6];
        int count = 0 ; 
        for(int i=0 ; i<6 ; i++){
            a[i]= sc.nextInt();
        }
        for(int i= 0 ; i <6-1 ; i++){
            for(int j =i+1; j<6 ; j++ ){
                
                if((a[j]-a[i])>a[6-1])
                    
                        count++;
                if(count>0)break;
            }
            if(count>0)break;
            
        }
        if(count>0)System.out.println(":(");
        else System.out.println("Yay!");
    }
 
}
