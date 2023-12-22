import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list  = new ArrayList<>();
        int cnt =0;

        for(int i = 0;i<n;i++){
            String a = sc.next();

            if(list.contains(a)){
                cnt++;
            }
            list.add(a);
        }

    

        for(int i =0;i<list.size()-1;i++){
            String b = list.get(i);
            String c = list.get(i+1);

            if(b.charAt(b.length()-1)!=c.charAt(0)){
                cnt++;
               // System.out.println(b.charAt(b.length()-1));
                //System.out.println(c.charAt(0));
            }
        }

        if(cnt==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        //System.out.println(cnt);

    }
}
