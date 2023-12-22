import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[] array=new int[w];
        for(int i=0;i<w;i++)array[i]=i+1;
        int a=0,b=0;
        for(int i=0;i<n;i++){
            String s=sc.next();
            String st1="";
            String st2="";
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)!=','){
                    st2+=s.charAt(j);
                }
                else {
                    st1=st2;
                    st2="";
                }
            }
            a=Integer.parseInt(st1);
            b=Integer.parseInt(st2);
            int tmp=0;
            tmp=array[a-1];
            array[a-1]=array[b-1];
            array[b-1]=tmp;
        }
        for(int i=0;i<w;i++)System.out.println(array[i]);
    }
}
