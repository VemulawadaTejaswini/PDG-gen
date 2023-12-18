import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		boolean flows = true;
		Scanner sc = new Scanner(System.in);

		//キューの数と待ち時間の設定
		String[] mstQue = sc.nextLine().split(" ");

		int queLineCount = Integer.parseInt(mstQue[0]);
		int exeTime = Integer.parseInt(mstQue[1]);

		//キュー情報の登録
		HashMap<Integer, MstQueJob> queStacks = new HashMap<Integer, MstQueJob>();
//		ArrayList<MstQueJob> queStacks = new ArrayList<MstQueJob>();
		for(int queLine = 0; queLineCount > queLine; queLine++) {
			String[] thisQueSet = sc.nextLine().split(" ");

			int id = queLine;
			String queid = thisQueSet[0];
			int restTime = Integer.parseInt(thisQueSet[1]);

			MstQueJob queStack = new MstQueJob(id, queid, restTime);
			System.out.println(queStack);
			queStacks.put(queLine, queStack);
		}

		int nowTime = 0;
		//キューの実行、つまり実行して終われば出力、終わらなければ戻す
		while(!queStacks.isEmpty()) {
			//一旦リセットする
			int losTime = 0;
			Set<Integer> delete_job = new HashSet<Integer>();

			//１イテレーションごとに繰り返す
			for(int changeQueId: queStacks.keySet()) {



				MstQueJob executedJob = queStacks.get(changeQueId);

				int afterExecuteTime = executedJob.restTime - exeTime;

				if(afterExecuteTime <=  0) {
					//Done this job
//					System.out.println("DONE");
					nowTime = nowTime + executedJob.restTime;

					System.out.println(executedJob.queId + " " + nowTime);

					delete_job.add(changeQueId);

				}else {
					//not yet Done this job
//					System.out.println("NOTYET");
					queStacks.put(changeQueId, new MstQueJob(executedJob.id, executedJob.queId, afterExecuteTime));
					nowTime += exeTime;
				}
			}

			//１イテレーションで終了ジョブのみを削除する
			for(Integer delete_id: delete_job) {
				//削除できてないで！
				queStacks.remove(delete_id);
			}



		}
		}


	//キュー内容の保持クラス
	static class MstQueJob {
		int id;
		String queId;
		int restTime;

		public MstQueJob(int id, String queid, int restTime) {
			this.id = id;
			this.queId = queid;
			this.restTime = restTime;
		}


	}
}

