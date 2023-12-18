import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            int n = sc.nextInt();
            int count = 0;
            if(n>36){
                System.out.println(0);
                continue;
            }else{
                for(int a=0; a<10;a++){
                    for(int b=0; b<10-a; b++){
                        for(int c=0; c<10-(a+b); c++){
                            for(int d=0; d<10-(a+b+c); d++){
                                if((a+b+c+d)==n){
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
            
            System.out.println(count);
        }
    }
}