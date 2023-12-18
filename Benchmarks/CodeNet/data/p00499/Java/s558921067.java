import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int date=0;
            while ((line = br.readLine()) != null) {
	            date=Integer.parseInt(line);
	            int kok_all=Integer.parseInt(br.readLine());
	            int san_all=Integer.parseInt(br.readLine());
	            int kok_max=Integer.parseInt(br.readLine());
	            int san_max=Integer.parseInt(br.readLine());
	            int store_kok,store_san;
	            store_kok=kok_all/kok_max;
	            store_san=san_all/san_max;
	            if(kok_all%kok_max!=0){
	            	store_kok++;
	            }
	            if(san_all%san_max!=0){
	            	store_san++;
	            }
	            System.out.println(date-Integer.max(store_kok, store_san));
	            break;
            }
            
        }
    }

}