import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Scanner tc = new Scanner (System.in);
        int a,b,c,d,e,k, soma1, soma2, soma3,soma4,soma5, soma6,soma7,soma8, soma9, soma10;
        a=tc.nextInt();
                b=tc.nextInt();

                        c=tc.nextInt();

                                d=tc.nextInt();

                                        e=tc.nextInt();

                                              k  =tc.nextInt();

        if((a<b) && (b<c) && (c<d) && (d<e)){
            soma1= b-a;
            soma2= c-a;
            soma3= d-a;
            soma4= e-a;
            soma5=  c-b;
            soma6= d-b;
            soma7= e-b;
            soma8= d- c;
            soma9= e-c;
            soma10= e-d;
            if((soma1<=k) && (soma2<=k)&& (soma3<=k) && (soma4<=k) && (soma5<=k) && (soma6<=k) && (soma7<=k) && (soma8<=k) && (soma9<=k) && (soma10<=k) ){
                System.out.println("Yay!");
    }else{
                System.out.println(":(");
            }
        }
    }
}
