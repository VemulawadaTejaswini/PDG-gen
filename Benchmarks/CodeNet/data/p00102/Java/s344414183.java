
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static String _5keta(int n){
        if(n/10000>1){return ""+n;}
        if(n/1000>1){return " "+n;}
        if(n/100>1){return "  "+n;}
        if(n/10>1){return "   "+n;}
        return "    "+n;
    }
    public static void main(String[] args)  {

    	try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while((line=br.readLine())!=null){if(line.isEmpty())break;
	        	String[] spl = line.split(" ");
	            int n = Integer.parseInt(spl[0]);
	            if(n==0){break;}
                    int[][] matrix = new int[n][n];
                    for(int i=0; i<n;i++){
                        line=br.readLine();
                        spl=line.split(" ");
                        for(int j=0; j<n;j++){
                            matrix[i][j]=Integer.parseInt(spl[j]);   
                        }
                    }
                    for(int i=0; i<n;i++){
                        int sum=0;
                        for(int j=0;j<n;j++){
                            sum+=matrix[i][j];
                            System.out.print(_5keta(matrix[i][j]));
                        }
                        System.out.println(_5keta(sum));
                    }
                    for(int j=0; j<n;j++){
                        int sum=0;
                        for(int i=0; i<n; i++){
                            sum+=matrix[i][j];
                        }
                        System.out.print(_5keta(sum));
                    }
                    System.out.println("");
            }//End WHILE


        }catch(Exception e){e.printStackTrace();}

    }


}