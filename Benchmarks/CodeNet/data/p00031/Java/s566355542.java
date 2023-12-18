import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                while(sc.hasNext()){
                        String b = Integer.toString(sc.nextInt(), 2); 
                        String s = ""; 
                        for(int i = 0; i < b.length(); i++){
                                if(b.charAt(i) == '1'){
                                        if(s != ""){
                                                s += " ";
                                        }   
                                        s += (int)Math.pow(2,i);
                                }   
                        }   
                        System.out.println(s);
                }   
                sc.close();
        }   
}