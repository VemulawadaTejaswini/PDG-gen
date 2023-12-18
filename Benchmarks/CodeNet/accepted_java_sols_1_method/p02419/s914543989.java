import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String w=sc.next();
        String t;
        int count=0;
        while(!((t=sc.next()).equals("END_OF_TEXT"))){
            t=t.toLowerCase();
            if(t.equals(w)){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
    
