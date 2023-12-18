import java.util.*;


class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                for(int i = 0 ; i < n ; i++){
                        int out = 0;
                        int runner = 0;
                        int point = 0;
                        while(out < 3){ 
                                String s = sc.next();
                                if(s.equals("HIT")){
                                        if(runner == 3){ 
                                                point++;
                                        }else{
                                                runner++;
                                        }   
                                }   
                                if(s.equals("HOMERUN")){
                                        point += runner+1;
                                        runner = 0;
                                }   
                                if(s.equals("OUT")){
                                        out++;
                                }   
                        }   
                        System.out.println(point);
                }   
                sc.close();
        }   
}