import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String order,str;
        HashSet<String> dic = new HashSet<>();
        
        for(int i = 0;i < n;i++){
            order = sc.next();
            str = sc.next();
            if(order.matches("insert")) dic.add(str);
            else if(order.matches("find")){
                if(dic.contains(str)) System.out.println("yes");
                else    System.out.println("no");
            }
        }
    }
}
