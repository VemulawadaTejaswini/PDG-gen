import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
        String x = sc.next();
        String s[] = x.split("");
        String end[] = new String[a];
        List list = Arrays.asList(s);
        Collections.reverse(list);
        int check = 1;
        String bin ;
        int ans = 0;
        int roop = 0;
        int count = 0;
        int count2 = 0;
        int i,j,g,p;
        for(g = 1; g <= a;g++){
          ans = 0;
          count = 0;
          count2 = 0;
        	for(i = 0;i < a;i++){
         	 check = 0;
         	 if(list.get(i).equals("1") && i != a - g ){
           	 check = 1;
           	 for(j = 0; j < i; j++){
           	   check = check * 2;

           	 	}
               count += 1;
             }else if((list.get(i).equals("0") && i == a - g)){
             check = 1;
           	 for(j = 0; j < i; j++){
           	   check = check * 2;
           	 	}
               count += 1;
         	 }
              ans += check;
        	}
		      //System.out.println(ans); 
		      //System.out.println(count);           
              while(true){
                ans = ans % count;
                count2 += 1;
                if(ans == 0){
                  break;
                }else if(ans == 1){
                  count2 += 1;
                  break;
                }else{
                 count = 0;
                 bin  = Integer.toBinaryString(ans);
                 end = bin.split("");
                 for(p = 0;p < bin.length();p++){
                   if(end[p].equals("1")){
                     count += 1;
                   }
                 }
                }
              }         
              System.out.println(count2); 
        }
        
        

 
    }
}