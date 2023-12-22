import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
        a = 0;b = 0;c=0;d=0;e=0;e=0;f=0;g=0;h=0;i=0;j=0;k=0;l=0;m=0;n=0;o=0;p=0;
        q=0;r=0;s=0;t=0;u=0;v=0;w=0;x=0;y=0;z=0;

        String line = new String();
        while((line = reader.readLine())!=null){
            int len = line.length();
            for(int num =0;num < len;num++){
                String ch = line.toLowerCase();
                char ch2 = ch.charAt(num);

                if(ch2 =='a')a++;
                else if(ch2 =='b')b++;
                else if(ch2 =='c')c++;
                else if(ch2 =='d')d++;
                else if(ch2 =='e')e++;
                else if(ch2 =='f')f++;
                else if(ch2 =='g')g++;
                else if(ch2=='h')h++;
                else if(ch2 =='i')i++;
                else if(ch2 =='j')j++;
                else if(ch2 =='k')k++;
                else if(ch2=='l')l++;
                else if(ch2=='m')m++;
                else if(ch2=='n')n++;
                else if(ch2=='o')o++;
                else if(ch2=='p')p++;
                else if(ch2=='q')q++;
                else if(ch2=='r') r++;
                else if(ch2=='s') s++;
                else if(ch2=='t') t++;
                else if(ch2=='u') u++;
                else if(ch2=='v') v++;
                else if(ch2=='w') w++;
                else if(ch2=='x') x++;
                else if(ch2=='y') y++;
                else if(ch2=='z') z++;
                


            }
        }
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);
        System.out.println("d : "+d);
        System.out.println("e : "+e);
        System.out.println("f : "+f);
        System.out.println("g : "+g);
        System.out.println("h : "+h);
        System.out.println("i : "+i);
        System.out.println("j : "+j);
        System.out.println("k : "+k);
        System.out.println("l : "+l);
        System.out.println("m : "+m);
        System.out.println("n : "+n);
        System.out.println("o : "+o);
        System.out.println("p : "+p);
        System.out.println("q : "+q);
        System.out.println("r : "+r);
        System.out.println("s : "+s);
        System.out.println("t : "+t);
        System.out.println("u : "+u);
        System.out.println("v : "+v);
        System.out.println("w : "+w);
        System.out.println("x : "+x);
        System.out.println("y : "+y);
        System.out.println("z : "+z);

        }
    }



