import java.io.*;
import java.util.Arrays;

public class Main{ 
        public static void main(String[] args){
            int count=0,jc=0,il;
            int bl[],al[];
            String moji;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{    bl = new int[400];
                al = new int[40];
                Arrays.fill(al,0);
                String[] moji1=new String[1200];
                while(true){
                    moji=reader.readLine();
                    bl[jc]=moji.length();
                    String kmoji=moji.toLowerCase();
                    for(il=0;il<bl[jc];il++){
                        moji1[il]=String.valueOf(kmoji.charAt(il));
                    }
                    if(moji.length()==0){
                        break;
                    }
                for(il=0;il<bl[jc];il++){
                    if(kmoji.indexOf("a")!=-1){
                        al[0]+=1;
                    }
                    if(kmoji.indexOf("b")!=-1){
                        al[1]+=1;
                    }
                    if(kmoji.indexOf("c")!=-1){
                        al[2]+=1;
                    }
                    if(kmoji.indexOf("d")!=-1){
                        al[3]+=1;
                    }
                    if(kmoji.indexOf("e")!=-1){
                        al[4]+=1;
                    }
                    if(kmoji.indexOf("f")!=-1){
                        al[5]+=1;
                    }
                    if(kmoji.indexOf("g")!=-1){
                        al[6]+=1;
                    }
                    if(kmoji.indexOf("h")!=-1){
                        al[7]+=1;
                    }
                    if(kmoji.indexOf("i")!=-1){
                        al[8]+=1;
                    }
                    if(kmoji.indexOf("j")!=-1){
                        al[9]+=1;
                    }
                    if(kmoji.indexOf("k")!=-1){
                        al[10]+=1;
                    }
                    if(kmoji.indexOf("l")!=-1){
                        al[11]+=1;
                    }
                    if(kmoji.indexOf("m")!=-1){
                        al[12]+=1;
                    }
                    if(kmoji.indexOf("n")!=-1){
                        al[13]+=1;
                    }
                    if(kmoji.indexOf("o")!=-1){
                        al[14]+=1;
                    }
                    if(kmoji.indexOf("p")!=-1){
                        al[15]+=1;
                    }
                    if(kmoji.indexOf("q")!=-1){
                        al[16]+=1;
                    }
                    if(kmoji.indexOf("r")!=-1){
                        al[17]+=1;
                    }
                    if(kmoji.indexOf("s")!=-1){
                        al[18]+=1;
                    }
                    if(kmoji.indexOf("t")!=-1){
                        al[19]+=1;
                    }
                    if(kmoji.indexOf("u")!=-1){
                        al[20]+=1;
                    }
                    if(kmoji.indexOf("v")!=-1){
                        al[21]+=1;
                    }
                    if(kmoji.indexOf("w")!=-1){
                        al[22]+=1;
                    }
                    if(kmoji.indexOf("x")!=-1){
                        al[23]+=1;
                    }
                    if(kmoji.indexOf("y")!=-1){
                        al[24]+=1;
                    }
                    if(kmoji.indexOf("z")!=-1){
                        al[25]+=1;
                    }
                }
                    jc++;
                }
                System.out.println("a : " + al[0]);
                System.out.println("b : " + al[1]);
                System.out.println("c : " + al[2]);
                System.out.println("d : " + al[3]);
                System.out.println("e : " + al[4]);
                System.out.println("f : " + al[5]);
                System.out.println("g : " + al[6]);
                System.out.println("h : " + al[7]);
                System.out.println("i : " + al[8]);
                System.out.println("j : " + al[9]);
                System.out.println("k : " + al[10]);
                System.out.println("l : " + al[11]);
                System.out.println("m : " + al[12]);
                System.out.println("n : " + al[13]);
                System.out.println("o : " + al[14]);
                System.out.println("p : " + al[15]);
                System.out.println("q : " + al[16]);
                System.out.println("r : " + al[17]);
                System.out.println("s : " + al[18]);
                System.out.println("t : " + al[19]);
                System.out.println("u : " + al[20]);
                System.out.println("v : " + al[21]);
                System.out.println("w : " + al[22]);
                System.out.println("x : " + al[23]);
                System.out.println("y : " + al[24]);
                System.out.println("z : " + al[25]);
            } catch (IOException e){
                System.out.println(e);
            }
        }
    }
