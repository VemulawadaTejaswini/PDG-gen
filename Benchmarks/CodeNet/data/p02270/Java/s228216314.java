/*ICGNYN 17D8103016H */
import java.util.Scanner;


 class  Main {
     private static int a[];
      private  static int n;
    static public  void  main (String[] av){
     int  b;
     int ans=0;
    int ol=0;
    int mx=0;
        Scanner sc =new Scanner(System.in);
        n =sc.nextInt();
        int k= sc.nextInt();
         a= new int[n];
        int v=0;
        for(int  i=0;i<n;i++){
            v=sc.nextInt();
            if (mx<v){
mx=v;
            }
            a[i]=v;
            ol+=v;
        }
        ol/=k;
if (ol<mx){
    ol=mx;
}
ol--;
//System.out.println(ol+"   aaaa");
while (true){
    ol++;
if(k3(ol,k)){
    break;
}

}

System.out.println(ol);


        }
        public static boolean k3(int ol,int k){
            int ck=1;int sum=ol;
for(int i=0;i<n;i++){
    if(sum==0){
        ck++;
        sum=ol;
    }
if ( a[i]>sum){
    ck++;
    sum=ol-a[i];
}

else{
    sum= sum-a[i];
}

}
if ( k>=ck){
    return true;
}

return false;
        }

}
