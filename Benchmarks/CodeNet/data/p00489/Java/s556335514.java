import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        int i=0,game=0,team=0,teama,teamb,a,b;
        int[] teams=null;
        boolean first=true;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
            	if(first){
            		team=Integer.parseInt(line);
            		teams=new int[team+1];
            		game=team*(team-1)/2;
            		first=false;
            	}else{
            		String[] str=line.split(" ");
            		teama = Integer.parseInt(str[0]);
            		teamb = Integer.parseInt(str[1]);
            		a = Integer.parseInt(str[2]);
            		b = Integer.parseInt(str[3]);
            		if(a>b){
            			teams[teama]+=3;
            		}else if(a==b){
            			teams[teama]++;
            			teams[teamb]++;
            		}else{
            			teams[teamb]+=3;
            		}
            		i++;
                	if(i==game){
                		break;
                	}
            	}
            }

            int[] sort=teams.clone();
            for(int j=1;j<sort.length;j++){
            	int max=sort[j];
            	int store=j;
            	for(int k=j+1;k<sort.length;k++){
                	if(sort[k]>max){
                		max=sort[k];
                		store=k;
                	}
                }
            	int w=sort[j];
            	sort[j]=sort[store];
            	sort[store]=w;
            }
            int rank=1;
            int[] result=new int[sort.length];
            i=0;
            
            for(int k=1;k<sort.length;k++){
            	i=0;
            	for(int l=1;l<teams.length;l++){
            		if(sort[k]==teams[l]&&result[l]==0){
            			result[l]=rank;
            			i++;
            		}
            	}
            	rank+=i;
            }
            for(int k=1;k<result.length;k++){
            	System.out.println(result[k]);
            }
        }
    }

}