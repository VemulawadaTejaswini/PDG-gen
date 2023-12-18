
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static int nokori1de[]=new int[1001];
    static int nokori2de[]=new int[2001];
    static int nokori3de[]=new int[3001];
    static int nokori4de[]=new int[4001];

    public static void main(String[] args)  {
    	Arrays.fill(nokori1de, -1);
    	Arrays.fill(nokori2de, -1);
    	Arrays.fill(nokori3de, -1);
    	Arrays.fill(nokori4de, -1);

    	try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while((line=br.readLine())!=null){if(line.isEmpty())break;
	            String[] spl = line.split(" ");
	            int a = Integer.parseInt(spl[0]);
	            int num = makefill4(a);
	            System.out.println(num);



            }
        }catch(Exception e){}

    }

    static int makefill4(int n){
    	if(n<0||4000<n){return 0;}
    	if(nokori4de[n]!=-1){return nokori4de[n];}
    	int kazu =0;
    	for(int i=0; i<=n&&i<=1000;i++){
    		int fueru = makefill3(n-i);
    		//System.out.println("nokori3 "+(n-i)+" -> "+fueru);
    		kazu+=fueru;
    	}
    	nokori4de[n]=kazu;return kazu;
    }

    static int makefill3(int n){
    	if(n<0&&3000<n){return 0;}
    	if(nokori3de[n]!=-1){return nokori3de[n];}
    	int kazu = 0;
    	for(int i=0; i<=n&&i<=1000;i++){
    		int fueru = makefill2(n-i);
    		//System.out.println("nokori2 "+(n-i)+" -> "+fueru);
    		kazu+=fueru;
    	}
    	nokori3de[n]=kazu;return kazu;
    }

    static int makefill2(int n){
    	if(n<0||2000<n){return 0;}
    	if(nokori2de[n]!=-1){return nokori2de[n];}
    	int kazu = 0;
    	for(int i=0; i<=n&&i<=1000;i++){
    		int fueru = makefill1(n-i);
    		//System.out.println("nokori1 "+(n-i)+" -> "+fueru);
    		kazu+=fueru;
    	}
    	nokori2de[n]=kazu;return kazu;
    }


    static int makefill1(int n){
    	if(n<0||1000<n){return 0;}
    	if(nokori1de[n]!=-1){return nokori1de[n];}
    	else {nokori1de[n]=1;  return 1;}


    }







}