import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        int a[]=new int[4];
        for(int i=0;i<4;i++){
            a[i]=0;
        }
        for(int i=0;i<n;i++){
            char buf = scn.next().charAt(0);
            switch(buf){
                case 'P':
                    a[0]++;
                    break;
                case 'W':
                    a[1]++;
                    break;
                case 'Y':
                    a[2]++;
                    break;
                case 'G':
                    a[3]++;
                    break;
            }
        }
        int cnt=0;
        for(int i=0;i<4;i++){
            if(a[i]>0)cnt++;
        }
        if(cnt==3){
          System.out.println("Three");
        }else{
          System.out.println("Four");
        }
    }
}