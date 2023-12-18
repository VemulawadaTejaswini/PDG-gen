import java.util.*;

class Main{           
  
   public static void main(String[] args){
         Scanner sc = new Scanner(System.in);  
         
     HashMap<Integer, String[]> keyMap = new HashMap<Integer, String[]>();

     String[] str1 = {".",",","!","?"};
     keyMap.put(1,str1);
     String[] str2 = {"a","b","c"};
     keyMap.put(2,str2);
     String[] str3 = {"d","e","f"};
     keyMap.put(3,str3);
     String[] str4 = {"g","h","i"};
     keyMap.put(4,str4);
     String[] str5 = {"j","k","l"};
     keyMap.put(5,str5);
     String[] str6 = {"m","n","o"};
     keyMap.put(6,str6);
     String[] str7 = {"p","q","r","s"};
     keyMap.put(7,str7);
     String[] str8 = {"t","u","v"};
     keyMap.put(8,str8);
     String[] str9 = {"w","x","y","z"};
     keyMap.put(9,str9);
     
     
     int n = sc.nextInt();
     
     for(int i = 0;i < n;i++){
         String array = sc.next();
         for(int j = 0;j < array.length();j++){
             int key = Character.getNumericValue(array.charAt(j));
             if(key != 0){
                 String [] map = keyMap.get(key);
                 int push = -1;
                 while(key != 0){
                     push++;
                     j++;
                     key = Character.getNumericValue(array.charAt(j));
                 }
                 
                 push %= map.length;
                 
                 System.out.print(map[push]);
                 
             }             
         }                  
         System.out.println("\n");
     }
     
   }         
         
 }