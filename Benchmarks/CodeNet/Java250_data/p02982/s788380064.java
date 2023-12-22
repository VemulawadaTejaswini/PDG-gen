import java.util.Scanner;

class Main {
    
    public static void main (String[] args){
        
        Main main = new Main ();
        
        Scanner sc = new Scanner (System.in);
        
        int N = sc.nextInt();
        int D = sc.nextInt();
        
        int [] list = new int [N*D];
        
        for (int index=0; index<N*D; index++){
            list[index]=sc.nextInt();
        }
        
        int count = 0;
        for (int index=0; index<N; index++){
            
            for (int index2=index+1; index2<N; index2++){
                
                double  sum = 0;
                
                for (int index3=0; index3<D; index3++){
                    
                    sum+=Math.abs((list[index*D+index3]-list[index2*D+index3])*(list[index*D+index3]-list[index2*D+index3]));
                }
                
                sum=Math.sqrt(sum);
                
                if (sum%1==0){
                    count++;
                }
            }
        }
        
        System.out.println(count);
        
        
    }
}