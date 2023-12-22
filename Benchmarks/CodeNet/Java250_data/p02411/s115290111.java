import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		new Main().run();

	}

	public void run(){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputData;
        List<TestResult> testDataList = new ArrayList<TestResult>();

        try {
        	//??\???
	        while(true){
				inputData = reader.readLine();
				if("-1 -1 -1".equals(inputData)){
					break;
				}
				String[] strData = inputData.split(" ");
				testDataList.add(new TestResult(Integer.parseInt(strData[0]) , Integer.parseInt(strData[1]) , Integer.parseInt(strData[2])));
	        }

	        //????????????
	        for(TestResult result :testDataList){
	        	System.out.println(result.getEvaluation());
	        }

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * TestResult?????????
	 * ??????????¨?????????°?????????????¨?????????°??????????¨?????????°
	 */
	class TestResult{

		//??????????¨?????????°
		public int m;
		//??????????¨?????????°
		public int f;
		//???????¨?????????°
		public int r;

		public String evalution;

		TestResult(int _m ,int _f,int _r){
			m = _m;
			f = _f;
			r = _r;

			setEvalution();

		}

		/**
		 * ??????????±????
		 */
		private void setEvalution(){

			int total = m + f;
			if(m == -1 || f == -1){
				evalution = "F";
			}else if(total >= 80){
				evalution = "A";
			}else if(total < 80 && total >=65){
				evalution = "B";
			}else if(total < 65 && total >=50){
				evalution = "C";
			}else if(total < 50 && total >=30){
				if(r >= 50){
					evalution = "C";
				}else{
					evalution = "D";
				}
			}else if(total < 30){
				evalution = "F";
			}
		}

		/**
		 * ???????????????
		 * @return
		 */
		public String getEvaluation(){

			return evalution;

		}

	}

}