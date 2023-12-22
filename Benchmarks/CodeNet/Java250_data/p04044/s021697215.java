import java.util.*;

class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        int n=sc.nextInt(),m=sc.nextInt();
        List<String> s=new ArrayList<String>();
        String tmp;
        for(int i=0;i<n;i++){
            tmp=sc.next();
            s.add(tmp);
        }
        Collections.sort(s);

        for(int i=0;i<n;i++){
            System.out.print(s.get(i));
        }
        System.out.println();
    }
}
