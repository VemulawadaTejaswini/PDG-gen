import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String arg[]){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str;
            str = br.readLine();
            int N = Integer.parseInt(str);
            double num = Math.pow(3,N);
            str=br.readLine();
            String sequence=str;

            int[] circle = new int[(int) num];
            for(int i=0;i<circle.length;i++){
                circle[i]=i;
            }
            int[] circle2 = circle.clone();
            int headFlag=0;
            int endFlag=circle.length-1;
            for(int i=0;i<sequence.length();i++){
                char song=sequence.charAt(i);
                if(song=='R'){
                    for(int j=0;j<circle.length;j++){
                        if(circle[j]==circle.length-1){
                            endFlag=j;
                            break;
                        }
                    }
                    for(int j=0;j<circle.length;j++){
                        if(j==endFlag){
                            circle[j]=0;
                            endFlag=endFlag-1;
                            headFlag=j;
                        }else {
                            circle[j]++;
                        }
                    }
                    circle2=circle.clone();
                }else {
                    for(int j=0;j<circle.length;j++){
                        int sum=0;
                        String tmp =Integer.toString(circle[j],3);
                        for(int t=0;t<tmp.length();t++){
                            if(tmp.charAt(tmp.length()-1-t)=='0'){
                                sum+=0;
                            }else if(tmp.charAt(tmp.length()-1-t)=='1'){
                                sum+=(int) (2*Math.pow(3,t));
                            }else {
                                sum+=(int) (1*Math.pow(3,t));
                            }
                        }
                        int flag=0;
                        for(int t=0;t<circle.length;t++){
                            if(circle2[t]==sum){
                                flag=t;
                            }
                        }
                        circle[j]=circle2[flag];
                    }
                    circle2=circle.clone();
                }
            }
            for(int i=0;i<circle.length;i++){
                if(i==circle.length){
                    System.out.println(circle[i]);
                }else {
                    System.out.print(circle[i] + " ");
                }
            }
        }catch (IOException e){
            e.printStackTrace();;
        }
    }
}
