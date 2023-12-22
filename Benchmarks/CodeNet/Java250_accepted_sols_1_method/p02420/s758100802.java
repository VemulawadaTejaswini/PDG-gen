import java.io.*;

public class Main{ 
        public static void main(String[] args){
            int i,m,j=0,kazu,k,a,count=0;
            int b[];
            String kard;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{    b = new int[400];
                String[] kard1=new String[500];
                String[][] temp=new String[20][500];
                while(true){
                    kard=reader.readLine();
                    b[j]=kard.length();
                    if(kard.equals("-")){
                        break;
                    }
                    for(i=0;i<b[j];i++){
                        kard1[i]=String.valueOf(kard.charAt(i));
                    }
                    String kazul=reader.readLine();
                    kazu = Integer.parseInt(kazul);
                    for(m=0;m<kazu;m++){
                        String al=reader.readLine();
                        a = Integer.parseInt(al);
                        k=0;
                        for(i=a;i<b[j];i++){
                            temp[count][k]=kard1[i];
                            k++;
                        }
                        for(i=0;i<a;i++){
                            temp[count][k]=kard1[i];
                            k++;
                        }
                        for(i=0;i<b[j];i++){
                            kard1[i]=temp[count][i];
                        }
                    }
                    j++;
                    count++;
                }
                i=0;
                while(count>i){
                    for(j=0;j<b[i];j++){
                        System.out.print(temp[i][j]);
                    }
                    System.out.printf("\n");
                    i++;
                }
            } catch (IOException e){
                System.out.println(e);
            }
        }
    }
