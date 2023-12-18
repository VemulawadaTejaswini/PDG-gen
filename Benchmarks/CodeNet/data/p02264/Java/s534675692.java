import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;
class Main{
    static public void  main(String[] av){
        int sum=0;

        Scanner sc =new Scanner(System.in);
       // int n =sc.nextInt();
int ch =1;
int[] a= new int[100];

    //String s= sc.next();
    int n = sc.nextInt();
    int q =sc.nextInt();
    List<String> list = new ArrayList<String>();
    List<Integer> intlist = new ArrayList<Integer>();
    List<String> sl = new ArrayList<String>();
    List<Integer> il = new ArrayList<Integer>();
for(int k=0;k<n;k++){
    list.add(sc.next());
    intlist.add(sc.nextInt());
}     
int q2= q;
int t=0;
    while ( list.size() !=0){
   if (q2==0){
       q2=q;
   }
        if ( intlist.get(0) <=q2){
            t+=intlist.get(0);
q2=q2-intlist.get(0);
sl.add(list.get(0));
il.add(t);

intlist.remove(0);
list.remove(0);
q2=q;
        }
        else{
       t+=q2;     
intlist.set(0,intlist.get(0)-q2);
q2=0;
int x=intlist.get(0);
String y=list.get(0);
intlist.remove(0);
list.remove(0);
intlist.add(x);
list.add(y);
        }

    }
    for (int i=0;i<n;i++){
        System.out.println(sl.get(i)+ " "+ il.get(i));
    }
}
    }

