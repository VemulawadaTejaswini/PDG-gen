import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            String line = br.readLine();
            int deptWeek = Integer.parseInt(line);
            int dept = 100000;
            for(int i = 0; i < deptWeek; i++ ){
            	int checkDept = (int)(dept * 0.05);
            	dept = dept + checkDept;
            	String strCheckDept = String.valueOf(dept);
            	String num = strCheckDept.substring(strCheckDept.length() - 3, strCheckDept.length());
            	if(!num.equals("000")){
            		int numnum = Integer.parseInt(num);
            		dept = dept + 1000 - numnum;
            	}
            }
            System.out.println(dept); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}