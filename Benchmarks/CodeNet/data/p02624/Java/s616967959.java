import java.util.*;
class Main {
	public static void main(String[] a) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
      //  List<Integer>list=new ArrayList<>();
        var sample=new Object(){
            int f(long ss){
                int num=0;
                long i=0;
                for(i=1;i<=ss;i++){
                    if(ss%i==0)num++;
                }
               // System.out.println(ss+" "+num);
                return num;
            }
        };
        long kazu=0;
        for(long i=1;i<=n;i++){
            kazu+=((i)*sample.f(i));
           // System.out.println(kazu);
        }
        System.out.print(kazu);
        sc.close();
	}
}

