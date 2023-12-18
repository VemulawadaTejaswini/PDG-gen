import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ninzu,saishonoishi,wannnoishi;
        
        ninzu = sc.nextInt();
        saishonoishi = sc.nextInt();
        wannnoishi = saishonoishi;
        while(ninzu != 0){

            int[] kouhosha = new int[ninzu];
            
            for(int i=0; i< kouhosha.length ; i++){
                kouhosha[i]=0;
            }
            
            for(int i=0 ;;i++){
                if(i == ninzu){
                    i = 0;
                }
                if(wannnoishi != 0){
                    kouhosha[i] += 1;
                    wannnoishi -= 1;
                    
                } else if(wannnoishi ==0){
                    int checker = 0;
                    for(int j = 0; j < kouhosha.length; j++){
                        if(kouhosha[j] != 0)
                            checker += 1;
                        if(checker > 1){
                            wannnoishi = kouhosha[i];
                            kouhosha[i] = 0;
                            break;
                        }
                        
                    }
                    if (checker == 1){
                        if(i == 0){
                            System.out.println(ninzu - 1);
                            break;
                        }else{
                            System.out.println(i-1);
                            break;
                        }
                    }
                }
            }
          ninzu = sc.nextInt();
          saishonoishi = sc.nextInt();
          wannnoishi = saishonoishi;
            
            
        }
        
    }
}