import java.io.*;

public class Main{ 
        public static void main(String[] args){
            int i,m,kazu,k,a,count=0,c,d;
            String kard;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{ 
                int[] kard1=new int[100];
                int[][] temp=new int[1000][100];
                while(true){
                    kard=reader.readLine();
                    String suuti[] = kard.split(" ");
                     c = Integer.parseInt(suuti[0]);
                     kazu = Integer.parseInt(suuti[1]);
                    if(c==0){
                        break;
                    }
                    int e = c;
                    for(i=0;i<c;i++){
                        kard1[i]=e;
                        e--;
                    }
                    for(m=0;m<kazu;m++){
                        String al=reader.readLine();
                        String suuti1[] = al.split(" ");
                        a = Integer.parseInt(suuti1[0]);
                        d = Integer.parseInt(suuti1[1]);
                        k=0;
                        for(i=a-1;i<a-1+d;i++){
                            temp[count][k]=kard1[i];
                            k++;
                        }
                        for(i=0;i<a-1;i++){
                            temp[count][k]=kard1[i];
                            k++;
                        }
                        for(i=a+d-1;i<c;i++){
                            temp[count][k]=kard1[i];
                            k++;
                        }
                        for(i=0;i<c;i++){
                            kard1[i]=temp[count][i];
                        }
                    }
                    count++;
                }
                i=0;
                while(count>i){
                    System.out.println(temp[i][0]);
                    i++;
                }
            } catch (IOException e){
                System.out.println(e);
            }
        }
    }
