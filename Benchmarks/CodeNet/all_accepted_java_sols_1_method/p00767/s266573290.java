import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int h=0,w=0;
        
        loop1:
        while(true){
            h=sc.nextInt();
            w=sc.nextInt();
            
            if(h==0 && w==0)break;
            
            int p = h*h + w*w;
            
            for(int i=h+1;i*i<p;i++){
                for(int j=i+1;j*j<=p-i*i;j++){
                    if(i*i+j*j==p){
                        System.out.println(i+" "+j);
                        continue loop1;
                    }
                }
            }
            
            for(;;){
                p++;
                
                for(int j=(int)Math.sqrt(p);j>0;j--){
                    for(int i=j-1;i>0;i--){
                        if(i*i+j*j==p){
                            System.out.println(i+" "+j);
                            continue loop1;
                        }
                    }
                }
            }
            
        }
    }
}